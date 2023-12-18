//YukiOtake-2018/03/04
//time:12:11
import java.util.Scanner;
class main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		while(true){
      int n=scan.nextInt();
      int p=scan.nextInt();
      // int n=3,p=2;
      if(n==0 && p==0){
        break;
      }
      int[] data=new int[n];
      int i=0,temp=p;
      while(true){
        if(i==n){
          i=0;
        }
        if(temp>0){
          temp--;
          data[i]++;
        }
        else{
          temp=data[i];
          data[i]=0;
        }
        if(data[i]==p){
          break;
        }
        i++;        
      }
      System.out.println(i);
		}
	}
}

