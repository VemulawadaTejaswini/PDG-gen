import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        long h=scan.nextInt();
        int n=scan.nextInt();
      	int []arr=new int[n];
      for (int i=0;i<n;i++){
      arr[i]=scan.nextInt();
        h-=arr[i];       
      }
      if (h<=0){
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
      
        }
    }
