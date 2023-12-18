import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
 
	while(kbd.hasNext()) {
	    int n = kbd.nextInt();
	    int a = kbd.nextInt();
	    int b = kbd.nextInt();
	    int c = kbd.nextInt();
	    int x = kbd.nextInt();
	    if(!(n==0 && a==0 && b==0 && c==0 && x==0)){
		solve(n, a, b, c, x);
	    }
	}
    }
 
    static void solve(int n, int a, int b, int c, int x){
	int f=0;//テ」ツ?凝」ツ?凝」ツ?」テ」ツ?淌」ツδ陛」ツδャテ」ツδシテ」ツδ?ヲツ閉ー
	int[] r = new int[n];  //テ」ツδェテ」ツδシテ」ツδォテ、ツケツアテヲツ閉ーテ」ツ?ョテゥツ?催・ツ按?
	int i;   //テ、ツスツ愿ヲツ・ツュテァツ板ィ
	for(i=0; i<n; i++){      //テ、ツケツアテヲツ閉ーテヲツ板セテ」ツつ甘ィツセツシテ」ツつ?
	    r[i] = kbd.nextInt();
	}
 
	i=0;
	while(f<=10000 && i<n){
	    if(r[i]==x){
		i++;
	    }
	    x = (a*x+b)%c;
	    f++;
	}
	
	if(i==n){
	    System.out.println(f-1);
	}
	else{
	    System.out.println("-1");
	}
    }
}