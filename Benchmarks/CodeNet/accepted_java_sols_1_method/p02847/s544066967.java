import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        for(int i = 0;i < week.length;i++){
            if(s.equals(week[i])){
                System.out.println(7-i);
                break;
            }
        }
    }
}