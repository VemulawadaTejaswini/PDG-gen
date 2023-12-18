import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int k = in.nextInt();
       ArrayList<Integer> list = new ArrayList<>(k);
      while(k--!=0){
          list.add(in.nextInt());}
      while(true){
          boolean flag = true;
          String s = n+"";
           for (int i =0;i<s.length();i++){
              if (list.contains(Character.getNumericValue(s.charAt(i)))){
                  flag = false;}}
              if(flag){
                  break;}
              else{
                  n++;}}
        System.out.println(n);
      }
}
     
