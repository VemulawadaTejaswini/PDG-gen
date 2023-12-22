import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = Integer.parseInt(sc.next());
        sc.nextLine();
        char[][] data = new char[a+2][b+2];
        for(int i = 0;i<a+2;i++){
            Arrays.fill(data[i], '.');
        }
        for(int i = 1;i<a+1;i++){
            String s = sc.nextLine();
            for(int j = 1;j<b+1;j++){
                data[i][j] = s.charAt(j-1);
            }
        }
        String ans = "Yes";
        for(int i = 1;i<a+1;i++){
            for(int j = 1;j<b+1;j++){
                if(data[i][j] == '#'){
                    if(data[i+1][j] == '.'
                    && data[i][j+1] == '.'
                    && data[i-1][j] == '.'
                    && data[i][j-1] == '.'){
                        ans = "No";
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}