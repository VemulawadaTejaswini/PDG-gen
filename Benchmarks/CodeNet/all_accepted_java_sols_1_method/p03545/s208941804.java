import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int[] li = new int[4];
        for(int i = 0; i < 4; i++){
            li[i] = Character.getNumericValue(s[i]);
        }
        if(li[0]+li[1]+li[2]+li[3] == 7)System.out.println(li[0]+"+"+li[1]+"+"+li[2]+"+"+li[3]+"=7");
        else if(li[0]+li[1]+li[2]-li[3] == 7) System.out.println(li[0]+"+"+li[1]+"+"+li[2]+"-"+li[3]+"=7");
        else if(li[0]+li[1]-li[2]+li[3] == 7) System.out.println(li[0]+"+"+li[1]+"-"+li[2]+"+"+li[3]+"=7");
        else if(li[0]-li[1]+li[2]+li[3] == 7) System.out.println(li[0]+"-"+li[1]+"+"+li[2]+"+"+li[3]+"=7");
        else if(li[0]+li[1]-li[2]-li[3] == 7) System.out.println(li[0]+"+"+li[1]+"-"+li[2]+"-"+li[3]+"=7");
        else if(li[0]-li[1]-li[2]+li[3] == 7) System.out.println(li[0]+"-"+li[1]+"-"+li[2]+"+"+li[3]+"=7");
        else if(li[0]-li[1]+li[2]-li[3] == 7) System.out.println(li[0]+"-"+li[1]+"+"+li[2]+"-"+li[3]+"=7");
        else if(li[0]-li[1]-li[2]-li[3] == 7) System.out.println(li[0]+"-"+li[1]+"-"+li[2]+"-"+li[3]+"=7");
    }
}