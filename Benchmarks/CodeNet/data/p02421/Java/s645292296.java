import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str,num;
        int a,b,i,j,x,y;
        str = scan.nextLine();
        a = Integer.valueOf(str);
        x = 0;
        y = 0;
        for(i=0;i<a;i++){
            str = scan.nextLine();
            String[] words = str.split(" ", 0);
            if(words[0].equals(words[1])){
                x += 1;
                y += 1;
            }else {
                if(words[0].length()>words[1].length()){
                    b = words[1].length();
                }else{
                    b = words[0].length();
                }
                for (j = 0; j < b; j++) {
                    if(words[0].charAt(j)>words[1].charAt(j)){
                        x += 3;
                        break;
                    }else if(words[0].charAt(j)<words[1].charAt(j)){
                        y += 3;
                        break;
                    }
                }
                if(j == b){
                    if(words[0].length()>words[1].length()){
                        x += 3;
                    }else{
                        y += 3;
                    }
                }
            }
        }
        System.out.println(x+" "+y);
        scan.close();

    }

}

