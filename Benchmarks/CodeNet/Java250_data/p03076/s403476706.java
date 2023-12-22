import java.util.Scanner;
 
class Main {
  static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
		
       int nam = 0; int min = 10;int sam = 0;
      
      for(int i=0;i<5;i++){
        nam = sc.nextInt();
         if(nam%10==0){sam +=nam;}
        else{
        	min = Math.min(min,nam%10);//一番時間をとる
            sam += nam+(10-nam%10);
        }
      }
      System.out.print(sam-(10-min));
      
    }
}