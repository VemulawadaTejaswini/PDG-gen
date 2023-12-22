import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int s =sc.nextInt();
       ArrayList<Integer> List = new ArrayList<>();
       List.add(s);
       int opt=0;
       while(true){
           int now_num = List.get(List.size()-1);
           int num = now_num%2;
           int next_num;
           if(num==0) next_num=now_num/2;
           else next_num=3*now_num+1;
           if(List.contains(next_num)==true){
               List.add(next_num);
               opt = List.size();
               break;
           }
           else List.add(next_num);
       }
        System.out.println(opt);
    }
}