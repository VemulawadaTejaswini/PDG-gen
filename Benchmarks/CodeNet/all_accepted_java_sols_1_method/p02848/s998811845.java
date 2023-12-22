import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();

        for(int i = 0;i < s.length;i++){
            for(int j = 0;j < n;j++){
                if(s[i] == 'Z'){
                    s[i] = 'A';
                }else{
                    s[i]++;
                }
            }
        }

        for(char ch:s)
            System.out.print(ch);
    }
}