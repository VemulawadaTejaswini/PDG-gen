import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String b = sc.nextLine();
        int max = 0;
        for(int i = 0;i <a;i++){
            String head = b.substring(0,i);
            String tail = b.substring(i);
            int count = 0;
            for(int j = 'a';j<='z';j++){
                if(head.indexOf(j)!= -1 && tail.indexOf(j) != -1){
                    count++;
                }
            }
            max = Math.max(count,max);
        }
    System.out.println(max);
    }
}