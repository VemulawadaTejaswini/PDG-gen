import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int n = sc.nextInt();
        int q = sc.nextInt();
		int [] L = new int [n];
        int [] R = new int [n];
        String s = sc.next();
        int count = 0;
        L[0]=0;
        R[n-1]=0;
        for(int i=0;i<n-1;i++){if(s.substring(i,i+2).equals("AC")){count++;}
                            }	
        for(int i=1;i<n;i++){if(s.substring(i-1,i+1).equals("AC")){L[i]=L[i-1]+1;}
                                else{L[i]=L[i-1];}
                            }
        for(int i=n-2;i>=0;i--){if(s.substring(i,i+2).equals("AC")){R[i]=R[i+1]+1;}
                                else{R[i]=R[i+1];}
                            }                       
	    for(int i=0;i<q;i++){int l = sc.nextInt();
                             int r = sc.nextInt();
                             System.out.println(L[r-1]+R[l-1]-count);}
  }
}
