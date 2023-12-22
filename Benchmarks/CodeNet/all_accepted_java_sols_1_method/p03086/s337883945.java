import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String base=scn.next();
        int cnt=0;
        int max=0;
        for(int i=0;i<base.length();i++){
            switch(base.charAt(i)){
                case 'A':
                case 'T':
                case 'C':
                case 'G':
                    cnt++;
                    if(i==base.length()-1&&cnt>max) max=cnt;
                    break;
                default:
                    if(cnt>max) max=cnt;
                    cnt=0;
                    break;
            }
        }
        System.out.println(max);
    }
}