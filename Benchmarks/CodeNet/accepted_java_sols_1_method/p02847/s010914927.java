import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if(Objects.equals(s, "SUN")){
            System.out.println("7");
        }else if(Objects.equals(s, "MON")){
            System.out.println("6");
        }else if(Objects.equals(s, "TUE")){
            System.out.println("5");
        }else if(Objects.equals(s, "WED")){
            System.out.println("4");
        }else if(Objects.equals(s, "THU")){
            System.out.println("3");
        }else if(Objects.equals(s, "FRI")){
            System.out.println("2");
        }else if(Objects.equals(s, "SAT")){
            System.out.println("1");
        }
        }
    }