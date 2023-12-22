import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int m=scan.nextInt();
    int like[]=new int[m];
    int k;
    
    //reset
    for(int j=0;j<m;j++){
      like[j]=0;
    }
    for(int i=0;i<n;i++){
      k=scan.nextInt();
      for(int j=0;j<k;j++){
        like[scan.nextInt()-1]+=1;
      }
    }
    
    int count=0;
    for(int j=0;j<m;j++){
      if(like[j]==n) count+=1;
    }
    System.out.println(count);
  }
}
