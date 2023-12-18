import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Mylist = new ArrayList<Integer>();
        int N = sc.nextInt(), K = sc.nextInt();
        for(int i = 0;i<N;i++){
          	int S = sc.nextInt();
            Mylist.add(S);
        }
      
        for(int j = K+1;j<=N;j++){
          	int A = Mylist.get(j-(K+1)); 
          	int B = Mylist.get(j-1);         	
            if (A < B){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}