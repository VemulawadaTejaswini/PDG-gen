import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n;
            while((n = scn.nextInt()) > 0) {
                ArrayList<char[]> cnvList = new ArrayList<>();
                while(n-- > 0) {
                    char[] ary = new char[] {
                        scn.next().charAt(0),
                        scn.next().charAt(0)
                    };
                    cnvList.add(ary);
                }

                StringBuilder sb = new StringBuilder();
                for(int m = scn.nextInt(); m > 0; m--) {
                    sb.append(scn.next());
                }

                char[] src = sb.toString().toCharArray();
                char[] dest = src.clone();

                for(char[] cnv : cnvList) {
                    for(int i = 0; i < src.length; i++) {
                        if(src[i] == cnv[0]) {
                            dest[i] = cnv[1];
                        }
                    }
                }
                System.out.println(dest);
            }
        }
    }
}