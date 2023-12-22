import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int day=scn.nextInt();
        String text="";
        switch(day){
            case 22:
                text="Christmas Eve Eve Eve";
                break;
            case 23:
                text="Christmas Eve Eve";
                break;
            case 24:
                text="Christmas Eve";
                break;
            case 25:
                text="Christmas";
        }
        System.out.println(text);
    }
}