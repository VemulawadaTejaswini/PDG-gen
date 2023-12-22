import java.util.*;

class Main{
    public static void main(String argv[]) {
        final int day =15;
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");
        Integer count=0;
        for(String i : str){
            if(i.equals("o"))count++;
        }
        if(8-count<=day-str.length){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}