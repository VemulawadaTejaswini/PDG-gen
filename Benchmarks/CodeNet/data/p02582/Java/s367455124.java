import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String w[] = s.split("", -1);
        int cnt = 0;
        for(int i = 0; i < 3; i++){
            if(w[i].equals("R")){
                cnt += 1;
            }
        }

        if(cnt == 3){
            System.out.println("3");
        }else if(cnt == 2 && w[1].equals("R")){
            System.out.println("2");
        }else if(cnt == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}