import java.util.Scanner;
import java.util.ArrayList;


public class Main{
 public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);
  String esu = scanner.next();
  String t = scanner.next();   
  int kaisu = esu.length() - t.length() + 1;
  
  //ArrayList<Integer> mat = new ArrayList<Integer>(); 
  int mat[];
  mat = new int[kaisu];
   
   for(int i=0;i<kaisu;i++){
      for(int j=0;j<t.length();j++){
        if(esu.charAt(i+j)==t.charAt(j)){
         mat[i]++;
        }else{
        }
      }  
    }
   int min =0;
   for(int i=0;i<kaisu;i++){
     if(mat[i]>min){
       min = mat[i];
     }else{
     }
   } 

  System.out.println(t.length()-min);
   
 }
}