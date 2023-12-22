import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i=0;i<3;i++){
            if(s.charAt(i)=='R'){
                count++;
            }
        }
        if(s.charAt(1)=='S'&&count==2){
            count = 1;
        }
        System.out.println(count);
    }
}