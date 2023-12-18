import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String[] S = scanner.nextLine().split("");
        String[] T = scanner.nextLine().split("");
        int cnt = 0;

        for(int i=0;i<S.length;i++){
            if(!(S[i].equals(T[i]))){
                cnt += 1;
            }
        }

        System.out.println(cnt);
        scanner.close();
    }
}