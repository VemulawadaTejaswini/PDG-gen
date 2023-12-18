import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        String T=scanner.next();
        int q=scanner.nextInt();
        for(int i=0;i<q;i++){
            if(isConclude(T,scanner.next())){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
    public static boolean isConclude(String original, String part){
        char[] originalChars=original.toCharArray();
        char[] partChars=part.toCharArray();
        return isConclude(originalChars,partChars);
    }
    public static boolean isConclude(char[] original, char[] part){
        for(int i=0;i<=original.length-part.length;i++){
            if(part[0]==original[i]){
                if(isMatch(original,part,i)){
                    return true;
                }else{
                    continue;
                }
            }
        }
        return false;
    }
    public static boolean isMatch(char[] original, char[] part,int index){
        for(int i=0;i<part.length;i++){
            if(original[index+i]!=part[i]) return false;
        }
        return true;
    }
}

