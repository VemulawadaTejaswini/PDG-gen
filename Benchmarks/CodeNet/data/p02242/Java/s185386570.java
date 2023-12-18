import java.util.Arrays;
import java.util.Scanner;
 
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int number=sc.nextInt();
            int max=100000000;
            
            
            int[] initial=new int[number+1];
            int[][] graph=new int[number+1][number+1];
            Arrays.fill(initial, max); //setting up the graph and filling
            //starter array with max values
            for(int i=0; i<number; i++) {
                int u=sc.nextInt();
                int k=sc.nextInt();
                
                for(int j=0; j<k; j++){
                    int v=sc.nextInt();
                    int c=sc.nextInt();
                    
                    graph[u][v]=c;//Filling in the graph
                }
            }
            initial[0]=0;
            
            for(int t=0; t<number; t++) {
                boolean update=false;
                
                for(int i=0; i<number; i++) {
                    for(int j=0; j<number; j++) {
                    	
                        if(initial[i]<max && graph[i][j]>0) {
                            if(initial[j]>initial[i]+graph[i][j]) {//Updating the max value
                                initial[j]=initial[i]+graph[i][j]; //And updating to least
                                					//later.
                                update=true;
                            }
                        }
                    }
                }
                if(! update) break;
            }
            //Print Answer
            for(int i=0; i<number; i++) {
                System.out.println(i+" "+initial[i]);
            }
        }
    }
