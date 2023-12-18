import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int i, min=500;
	    int n = kbd.nextInt();
	    int[][] ff = new int[3][n];
	    for(i=0; i<n; i++){
		ff[0][i] = kbd.nextInt();
		ff[1][i] = kbd.nextInt();
		ff[2][i] = kbd.nextInt();
		if(ff[0][i] < min) min = ff[0][i];
	    }
	    int m = kbd.nextInt();
	    int[][] mm = new int[2][m];
	    for(i=0; i<m; i++){
		mm[0][i] = kbd.nextInt();
		mm[1][i] = -1;
	    }
	    //テ・ツ?・テ・ツ環崚ァツオツづ」ツつ湘」ツつ?
	    sort(ff, n);

	    //ティツィツ暗ァツョツ療」ツ?禿」ツ?禿」ツ?凝」ツつ?
	    int s; //テヲツ慊?・ツ?ェテ・ツ?暗」ツδ陛」ツδャテ」ツδシテ」ツつコ
	    for(i=0; i<m; i++){ //テァツャツャiテ」ツδ。テ」ツδュテ」ツδ?」ツつ」テ」ツδシテ」ツ?ョ
		int pur = mm[0][i]; //テ」ツ?エテ」ツ?」テ」ツ?淌」ツつ甘」ツδ。テ」ツδュテ」ツδ?」ツつ」テ」ツδシ
		for(s=0; s<n; s++){ //テァツャツャsテ」ツδ陛」ツδャテ」ツδシテ」ツつコテ・ツ?ェテ・ツ?暗」ツ?ァ
		    int point = calc(ff, pur, s, n, min); //テ」ツδ敕」ツつ、テ」ツδウテ」ツδ暗ィツィツ暗ァツョツ?
		    if(point > mm[1][i]) mm[1][i] = point; //テ」ツδ敕」ツつ、テ」ツδウテ」ツδ暗、ツクツ甘ヲツ崢クテ」ツ?催ッツシツ?
		}
	    }

	    int cnt = 0;
	    for(i=0; i<m; i++){
		if(mm[1][i]==-1) cnt++;
	    }
	    //テ」ツ?凖」ツ?ケテ」ツ?ヲテ」ツδ敕」ツつ、テ」ツδウテ」ツδ暗」ツ?古」ツ?、テ」ツ??」ツ?ヲテ」ツ??」ツつ凝」ツ?凝ッツシツ?

	    if(cnt==0){
		for(i=0; i<m; i++)
		    System.out.println(mm[1][i]);
	    }
	    else System.out.println("-1");
	}
    }

    static void sort(int[][] ff, int n){
	int i, j;
	for(i=0; i<n; i++){
	    for(j=0; j<n; j++){
		if(ff[2][i] < ff[2][j]){
		    int[] w = ff[i];
		    ff[i] = ff[j];
		    ff[j] = w;
		}
	    }
	}
    }

    static int calc(int[][] ff, int pur, int s, int n, int min){
	int i;
	int point = 0; //テァツ渉セテ・ツ慊ィテ」ツ?ョテ」ツδ敕」ツつ、テ」ツδウテ」ツδ?
	int rest = 0; //テァツ渉セテ・ツ慊ィテ」ツ?ョテ、ツコツ暗・ツつ凖」ツ?ョテゥツ閉キテ」ツ??
	int mel = 0; //テァツ渉セテ・ツ慊ィテ」ツ?ョテ」ツδ。テ」ツδュテ」ツδ?」ツつ」テ」ツδシテ」ツ?ョテゥツ閉キテ」ツ??
	for(i=s; min < (pur-mel); i=(i+1)%n){
	    while(ff[0][i]<=(pur-mel)){
		mel += ff[0][i];
		rest += ff[1][i];
		point += ff[2][i];
		//System.out.println(ff[0][i]+" "+mel+" "+point);
	    }
	}
	if(pur-mel <= rest) return point;
	else return -1;
    }
}