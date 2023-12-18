import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int taro=0;
        int hanako=0;
        for(int i=0; i<n ;i++){
            String a=scanner.next();
            String b=scanner.next();
            switch(isWin(a,b)) {
                case 0:
                    taro++;
                    hanako++;
                    break;
                case 1:
                    taro += 3;
                    break;
                case 2:
                    hanako += 3;
                    break;
            }
        }
        System.out.println(taro+" "+hanako);
    }
    public static int isWin(String a,String b){
        int len=Math.min(a.length(),b.length());
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<len;i++){
            if(alphabet.indexOf(a.charAt(i))<alphabet.indexOf(b.charAt(i))){
                return 2;
            }else if(alphabet.indexOf(a.charAt(i))>alphabet.indexOf(b.charAt(i))){
                return 1;
            }
        }
        if(a.length()==b.length()){
            return 0;
        }else if(a.length()>b.length()){
            return 1;
        }else{
            return 2;
        }
    }
}

