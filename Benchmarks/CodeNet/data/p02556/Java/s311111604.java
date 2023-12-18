import java.util.*;
    public class Main{
    	public static void main(String[] args){
        	Scanner s  = new Scanner(System.in);
          	int n = s.nextInt();
          	int max = 0;
          	int[] Xs = new int[n];
          	int[] Ys = new int[n];
          	for(int i = 0;i<n;i++){
            	Xs[i] = s.nextInt();
              	Ys[i] = s.nextInt();
            }
          for(int i = 0;i<n;i++){
          	for(int j = i+1;j<n;j++){
            	max = Math.max(max,Math.abs(Xs[i]-Xs[j])+Math.abs(Ys[i]-Ys[j]));	
            }
          }
          System.out.println(max);
        }
    }