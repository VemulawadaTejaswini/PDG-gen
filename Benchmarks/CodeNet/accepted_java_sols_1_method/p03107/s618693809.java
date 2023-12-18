import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String S = scn.next();
        int red = 0;
        int blue = 0;
        for(int i=0;i<S.length();i++){
            char cube = S.charAt(i);
            if(cube=='0'){
                red++;
            }else{
                blue++;
            }
        }
        System.out.println(Math.min(red,blue)*2);
    }
}
