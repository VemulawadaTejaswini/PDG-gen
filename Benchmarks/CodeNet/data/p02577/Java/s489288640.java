import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();// 入力
      	int sum=0;
      
      	for(int i=0;i<n.length();i++){
          if(n.charAt(i)=='0'){
          	sum+=0;
          }
          if(n.charAt(i)=='1'){
          	sum+=1;
          }
          if(n.charAt(i)=='2'){
          	sum+=2;
          }
          if(n.charAt(i)=='3'){
          	sum+=3;
          }
          if(n.charAt(i)=='4'){
          	sum+=4;
          }
          if(n.charAt(i)=='5'){
          	sum+=5;
          }
          if(n.charAt(i)=='6'){
          	sum+=6;
          }
          if(n.charAt(i)=='7'){
          	sum+=7;
          }
          if(n.charAt(i)=='8'){
          	sum+=8;
          }
          if(n.charAt(i)=='9'){
          	sum+=9;
          }

        }
      
      
      	if(sum%9==0){
          System.out.println("yes");
        }else{
          System.out.println("No");
        }
      
    } 
}

















