import java.util.*;

class Main{
    static int n;
    static int[][] table;
    static int min;
    static int max;
    static int[][] maps;

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	n = sc.nextInt();

	while(n!=0){
	    min = 31;
	    max = 0;
	    table = new int[n][30];
	    for(int i=0; i<n; i++){
		int dateNum = sc.nextInt();
		for(int j=0; j<dateNum; j++){
		    int date = sc.nextInt();
		    table[i][date-1] = 1;
		    if(date>max)max = date;
		}
	    }
	    maps = new int[n][n];
	    for(int i=0; i<n; i++){
		maps[i][i] = 1;
	    }

	    solve();
	    if(min==31){min = -1;}
	    System.out.println(min);

	    n = sc.nextInt();
	}
    }

    public static void solve(){
	int[] checkList = new int[n];
	for(int j=0; j<max; j++){
	    checkList = new int[n];
	    for(int i=0; i<n; i++){
		if(table[i][j]==1){
		    checkList[i] = 1;
		}
	    }

	    setMaps(checkList);
	    if(collectedMaps()){min = j+1; return;}
	}
    }

    public static void setMaps(int[] checkList){
	for(int i=0; i<n; i++){
	    if(checkList[i]==1){//i&#200;&#214;&#204;&#220;&#8364;&#206;&#187;&#210;&#194;&#185;&#8364;&#172;&#8364;&#8364;&#8364;&#191;&#8364;&#233;
		for(int j=0; j<n; j++){
		    if(maps[i][j]==1){
			for(int k=0; k<n; k++){
			    if(checkList[k]==1)maps[k][j]=1;
			}
		    }
		}
	    }
	}
    }

    public static boolean collectedMaps(){
	int count = 0;
	for(int i=0; i<n; i++){
	    count = 0;
	    for(int j=0; j<n; j++){
		if(maps[i][j]==1){count++;}
	    }
	    if(count==n){return true;}
	}
	return false;
    }
}