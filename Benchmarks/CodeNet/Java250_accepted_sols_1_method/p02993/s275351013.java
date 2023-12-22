import java.util.*;

class Main{
    public static void main(String args[]){
        int count = 0;
        String ans[] = {"Good","Bad"};
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a[] = new char[str.length()];
        for(int i = 0;i < str.length();i++){
            a[i] = str.charAt(i);
        }if(a[0]==a[1]||a[1]==a[2]||a[2]==a[3]){
            count++;
        }
        System.out.print(ans[count]);
    }
}