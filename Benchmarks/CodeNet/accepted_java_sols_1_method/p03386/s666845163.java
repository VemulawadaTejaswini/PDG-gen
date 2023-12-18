import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt(),k=sc.nextInt();
        Set<Integer> ans = new TreeSet<>();
        if(a+k>b||b-k<a){
            for(int i = a;i<=b;i++){
                System.out.println(i);
            }
        } else {
            for(Integer i = a;i<a+k;i++){
                ans.add(i);
            }
            for(Integer i = b;i>b-k;i--){
                ans.add(i);
            }
            for(Integer s :ans){
                System.out.println(s);
            }
        }
    }
}