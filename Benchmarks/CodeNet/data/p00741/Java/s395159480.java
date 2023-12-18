import java.util.Scanner;

public class Main{

    static int count = 0;

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int w = 0,h = 0;
	int[] firstSearch = new int[2];

	while(sc.hasNext()){
	    w = sc.nextInt();
	    h = sc.nextInt();

	    if(w == 0 && h == 0) break;

	    int[][] islands = new int[h][w];

	    // テ・ツウツカテ、ツスツ愿ヲツ按?
	    for(int i = 0;i<h;i++){
	    	for(int j = 0;j<w;j++){
	    		islands[i][j] = sc.nextInt();
	    	}
	    }
	    
	    while(search(islands,firstSearch)){ // テ」ツ?ッテ」ツ?佚」ツつ?」ツ?ォティツ。ツ古」ツ?湘・ツウツカテ」ツつ津ヲツアツコテ・ツョツ?
	    	checkIslands(firstSearch[0],firstSearch[1],islands,true);
	    }

	    System.out.println(count);
	    count = 0;
	    }

    }

    static void checkIslands(int y,int x,int[][] islands,boolean first){
    	// 8テヲツ鳴ケテ・ツ青妥」ツつ津ィツヲツ凝」ツつ凝」ツ?づ」ツ?ソテ」ツ?淌」ツ?ィテ」ツ?禿」ツつ津ヲツオツキテ」ツ?ォテ」ツ?療」ツ?ヲテ」ツ??」ツ?湘」ツ??
    	// テ」ツ?ッテ」ツ?佚」ツつ?」ツ?ョテ、ツスツ催ァツスツョテ」ツ?凝」ツつ嘉」ツ?ソテ」ツ?ヲテ・ツ?ィテゥツδィテヲツオツキテ」ツ?ォテ」ツ?ェテ」ツ?」テ」ツ?ヲテ」ツ?淌」ツつ嘉」ツ?療」ツ?セテ」ツ??」ツ?」テ」ツ?禿」ツ?」テ」ツ?ヲテ」ツつォテ」ツつヲテ」ツδウテ」ツδ暗」ツ?凖」ツつ?
    	
    	if(y>islands.length-1 || y<0 || x<0) return;
    	if(x>islands[y].length-1 || islands[y][x]==0) return;
    	
    	islands[y][x] = 0;
    	
    	// テ、ツクツ?テ・ツ渉ウテ、ツクツ?テ・ツ渉ウ テ・ツ渉ウテ、ツクツ?テ、ツクツ?テ・ツキツヲテ、ツクツ?テ・ツキツヲ テ・ツキツヲテ、ツクツ甘」ツ?ョテゥツ??ァツ閉ェ
    	checkIslands(y-1,x,islands,false);
    	checkIslands(y-1,x+1,islands,false);
    	checkIslands(y,x+1,islands,false);
    	checkIslands(y+1,x+1,islands,false);
    	checkIslands(y+1,x,islands,false);
    	checkIslands(y+1,x-1,islands,false);
    	checkIslands(y,x-1,islands,false);
    	checkIslands(y-1,x-1,islands,false);
    	
    	if(first) count++;
    }

    static boolean search(int[][] islands,int[] firstSearch){
	for(int i = islands.length-1;i>=0;i--){
	    for(int j = islands[i].length-1;j>=0;j--){
		if(islands[i][j] == 1){
		    firstSearch[0] = i; // y
		    firstSearch[1] = j; // x
		    return true;
		}
	    }
	}
	return false;
    }

}