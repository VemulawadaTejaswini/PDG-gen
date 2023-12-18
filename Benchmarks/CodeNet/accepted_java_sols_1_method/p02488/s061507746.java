import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];
        scan.nextLine();
        
        for(int i = 0; i < n; i++){
            str[i] = scan.nextLine();
        }

        Arrays.sort(str);

        System.out.println(str[0]);
    }
}