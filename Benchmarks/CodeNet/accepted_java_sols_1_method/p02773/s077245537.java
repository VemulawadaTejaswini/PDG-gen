import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N;
  	N = sc.nextInt();
  	if(N==0) System.exit(0);

  	String[] s = new String[N];
  	int[] t = new int[N];
  
  	for (int i=0;i<N;i++){
		s[i] = sc.next();
	}
  	Arrays.sort(s);
  	int tmp = 1;
  	for(int k=0;k<N-1;k++){
      	if(s[k].compareTo(s[k+1])==0){
          tmp++;
          if(k==N-2) t[k+1] =tmp;
        }else{
          t[k] = tmp;
          tmp=1;
          if(k==N-2) t[k+1] =tmp;
        }
      
    } 	
  //	System.out.println("s: " + Arrays.toString(s));
  //	System.out.println("t: " + Arrays.toString(t));
	int max=0;
  	for(int l=0;l<N;l++){
      	if(max < t[l]) max = t[l];
    }
  	
  	for(int p=0;p<N;p++){
      	if(t[p]==max){
          System.out.println(s[p]);
        }
    }
  
	}
}