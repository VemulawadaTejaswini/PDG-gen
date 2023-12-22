import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      
      //入力
      String S =sc.next();
      
      //数字列の前半と後半
      String first1 = S.substring(0,2);//01
      //String first2 = S.substring(1,1);//0
      //S.charAt(1);
      
      String last1 = S.substring(2,4);//23
      //String last2 = S.substring(3,3);//0
      //S.charAt(3);
      
      //数字列から数値に変更
      int date1 = Integer.valueOf(first1);
      //int date2 = Integer.valueOf(first2);
      
      int date3 = Integer.valueOf(last1);
      //int date4 = Integer.valueOf(last2);
      //System.out.println(date1);//17
      //System.out.println(S.charAt(1));//7
      //System.out.println(S.charAt(3));//0
      //System.out.println(date3);//0
      
      
      //前半2桁と後半2桁が月として利用できる
      if((date1>0 && date1<=12) && (date3>0 && date3<=12)){//7//17
        	System.out.println("AMBIGUOUS");
              //後半2桁が月として利用できるか
      	      //if(date3>0 && date3<=12){//0//0
              //System.out.println("AMBIGUOUS");  
        }
      
        //前半2桁が月として利用できる
        else if(date1>0 && date1<=12) {
          System.out.println("MMYY");
        }
       //後半2桁が月として利用できる
        else if(date3>0 && date3<=12){
          System.out.println("YYMM");
        }
      	//どちらも月として利用できない
      	else{
          System.out.println("NA");
        }
    }
}
    
      //後半2桁が月として利用できるか
      //else {
        //if(S.charAt(3)>0 && date3<=12){//0//0
         // System.out.println(S.charAt(3));
         // System.out.println(date3);
        	//System.out.println("YYMM");   
        //}
        //else{
          //System.out.println("NA");
        //}
     // }
    //}
//}