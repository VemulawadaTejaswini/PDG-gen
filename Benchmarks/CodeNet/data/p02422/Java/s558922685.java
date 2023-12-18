import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str,num,code;
        int a,b,i,j,x,y;
        str = scan.nextLine();
        num = scan.nextLine();
        a = Integer.valueOf(num);
        x = 0;
        y = 0;
        for(i=0;i<a;i++){
            code = scan.nextLine();
            String[] words = code.split(" ", 0);
            if(words[0].equals("replace")){
                str = replace(words,str);
            }else if(words[0].equals(("print"))){
                print(words,str);
            }else{
                str = reverse(words,str);
            }
        }

        scan.close();

    }
    public static String replace(String words[],String str){
        int a,b;
        a = Integer.valueOf(words[1]);
        b = Integer.valueOf(words[2]);
        return str.substring(0,a) + words[3] + str.substring(b+1);
    }
    public static void print(String words[],String str){
        int a,b;
        a = Integer.valueOf(words[1]);
        b = Integer.valueOf(words[2]);
        System.out.println(str.substring(a,b+1));
    }
    public static String reverse(String words[],String str){
        int a,b,i;
        a = Integer.valueOf(words[1]);
        b = Integer.valueOf(words[2]);
        StringBuffer sb = new StringBuffer(str.substring(a,b+1));
        return str.substring(0,a)+sb.reverse().toString()+str.substring(b+1);
    }
}


