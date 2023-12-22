import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  String s = sc.next(); 
      int[] a = new int[4];
      for(int i=0;i<4;i++){
        a[i] = Character.getNumericValue(s.charAt(i));
      }
      char[] op = new char[3];
      for(int i=0;i<3;i++){
        op[i] = '+';
      }
      for(int i=0;i<(Math.pow(2,3));i++){
        for(int p=0;p<3;p++){
           op[p] = '+';
        }
        String bin = Integer.toBinaryString(i);
        int num = Integer.parseInt(bin);
        //System.out.println(String.format("%04d",num));
        for(int j=0;j<3;j++){
          //int n = 1&(i>>j);
          //System.out.println(j+"桁目を見ると"+n);
          if((1&i>>j)==1){
            //System.out.println(j+"桁目のopを変えるよ");
            op[j]='-';
          }
        }
        for(int l=0;l<4;l++){
          //System.out.print(op[l]);
        }
        //System.out.println();
      int sum=a[0];
      for(int m=0;m<3;m++){
        //System.out.print(op[m]);
        //System.out.print(a[m]);
        if(op[m]=='+'){
          sum+=a[m+1];
        }else{
          sum-=a[m+1];
        }
      }
        if(sum==7){
          for(int n=0;n<3;n++){
            System.out.print(a[n]);
            System.out.print(op[n]);         
          }
          System.out.println(a[3]+"="+sum);
          break;
        }
      }
			
    }
}