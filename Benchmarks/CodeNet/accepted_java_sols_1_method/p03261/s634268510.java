import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    scan.nextLine();
    String[] W=new String[N];
    for(int i=0;i<N;i++){
      W[i]=scan.nextLine();
    }
    
    for(int i=0;i<N-1;i++){
      for(int j=i+1;j<N;j++){
        if(W[i].equals(W[j])){
          System.out.println("No");
          System.exit(0);
        }
      }
    }
      for(int i=0;i<N-1;i++){
        int j=i+1;
        String A=W[i].substring(W[i].length()-1);
        String B=W[j].substring(0,1);
        if(!A.equals(B)){
          System.out.println("No");
          System.exit(0);
        }
      }
      System.out.println("Yes");
    }
  }
