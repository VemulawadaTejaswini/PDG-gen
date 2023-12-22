import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = true;
        String[] s = new String[n];
        s[0] = sc.next();
        for(int i =1;i<n;i++){
            String tmp = sc.next();
            if(Arrays.asList(s).contains(tmp)){
                ans = false;
                break;
            }
            s[i] = tmp;
            if(s[i].charAt(0)!=s[i-1].charAt(s[i-1].length()-1)){
                ans = false;
                break;
            }
        }
        if(ans){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}