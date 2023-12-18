import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char egara[] = new char[N];
    	char egara1[] = new char[N];
    	char egara2[] = new char[N];
        int suuji[] = new int[N];
    	int suuji1[] = new int[N];
    	int suuji2[] = new int[N];
        for(int i = 0; i < N; i++){
            String str = sc.next();
            egara[i] = str.charAt(0);
        	egara1[i] = egara[i];
        	egara2[i] = egara[i];
        	suuji[i] = str.charAt(1)-'1'+1;
        	suuji1[i] = suuji[i];
        	suuji2[i] = suuji[i];
        }
    	
    	for(int i = 0; i < N; i++){
    		bubble(i, suuji1, egara1);
    	}
    	
    	for(int i = 0; i < N; i++){
    		Selection(N, i, suuji, egara);
    	}
    	
    	for(int i = 0; i < N; i++){
    		System.out.print(egara1[i]);
    		System.out.print(suuji1[i]);
    		if(i == N-1){
    			System.out.println("");
    		}else{
    			System.out.print(" ");
    		}
    	}
    	check(N,suuji1, suuji2, egara1, egara2);
    	
    	for(int i = 0; i < N; i++){
    		System.out.print(egara[i]);
    		System.out.print(suuji[i]);
    		if(i == N-1){
    			System.out.println("");
    		}else{
    			System.out.print(" ");
    		}
    	}
    	check(N, suuji, suuji2, egara, egara2);
    }
	
	private static void bubble(int i, int suuji1[], char egara1[]){
		for(int j = i; j > 0; j--){
    		if(suuji1[j] < suuji1[j-1]){
    			int j0;
    			char j1;
    			j0 = suuji1[j];
    			suuji1[j] = suuji1[j-1];
    			suuji1[j-1] = j0;
    			j1 = egara1[j];
    			egara1[j] = egara1[j-1];
    			egara1[j-1] = j1;
    		}
    	}
	}
	
	private static void Selection(int N, int i, int suuji[], char egara[]){
		int minj = i;
		for(int j = i; j < N; j++){
			if(suuji[j] < suuji[minj]){
				minj = j;
			}
			
		}
		int j0;
		char j1;
		j0 = suuji[i];
    	suuji[i] = suuji[minj];
    	suuji[minj] = j0;
    	j1 = egara[i];
    	egara[i] = egara[minj];
    	egara[minj] = j1;
	}
	
	private static void check(int N,int suuji1[], int suuji2[], char egara1[], char egara2[]){
		String hantei = "Stable";
		for(int j = 0; j < N; j++){
			for(int k = j+1; k < N; k++){
				for(int j1 = 0; j1 < N; j1++){
					for(int k1 = j1+1; k1 < N; k1++){
				        if(suuji2[j] == suuji2[k] && egara2[j] == egara1[k1] && suuji2[j] == suuji1[k1] && egara2[k] == egara1[j1] && suuji2[k] == suuji1[j1]){
				        	hantei = "Not stable";
				        }
					}
				}
			}
		}
		System.out.println(hantei);
	}
}
