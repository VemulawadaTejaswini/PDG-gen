import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int num=sc.nextInt();
      String a=sc.next();
      String b=sc.next();
      String c=sc.next();
      int count=0;
      
      String[] strArrayA = new String[a.length()];
      String[] strArrayB = new String[b.length()];
      String[] strArrayC = new String[c.length()];
 
// 変数strの長さ分回す
	for (int i = 0; i < num; i++) {
    // strの先頭から1文字ずつString型にして取り出す
      String str1 = String.valueOf(a.charAt(i));
      String str2 = String.valueOf(b.charAt(i));
      String str3 = String.valueOf(c.charAt(i));
    // 配列に順番に格納する
      strArrayA[i]=str1;
      strArrayB[i]=str2;
      strArrayC[i]=str3;
    }
      
      for(int i=0;i<num;i++){
       if(strArrayA[i].equals(strArrayB[i])&&strArrayA[i].equals(strArrayC[i])&&strArrayB[i].equals(strArrayC[i])){
         
       }else if(strArrayA[i].equals(strArrayB[i])){
         count++;
       }else if(strArrayA[i].equals(strArrayC[i])){
         count++;
       }else if(strArrayB[i].equals(strArrayC[i])){
         count++;
       }else{
        count+=2; 
       }
      }
      
      System.out.println(count+"");
		
	}
}