import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int ans=0;
        String day=sc.next();
        String[]week={"SUN","MON","TUE","WED","THU","FRI","SAT"};
        for(int i=week.length-1;i>0;i--){
            if(day.equals(week[i])){;break;}
            else{ans++;}
        }
        System.out.println(ans+1);
    }
}