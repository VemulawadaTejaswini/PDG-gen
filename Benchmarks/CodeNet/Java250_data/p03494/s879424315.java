import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    //sc.nextLine();
    int[] array = new int[n];
    for(int i=0; i<n; i++){
      array[i] = sc.nextInt();
    }
    //処理部
    boolean judge =true;
    int a=0;
    int cnt=0;
    while(judge){
        for(int j=0; j<n; j++){
            if(array[j]%2==0){
                array[j]=array[j]/2;
                a++;
            }else{
                judge=false;
            }
            if(a==n){
                cnt++;
                 a=0;
            }
           
        }
    }
    System.out.println(cnt);
  }
}