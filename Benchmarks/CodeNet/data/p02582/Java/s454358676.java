import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // とんでもないコードになってしまったｿﾞｫ...

        Scanner sc = new Scanner(System.in);
        String[] string = sc.next().split("");

        // RRR
        if(string[0].equals("R")){
            if(string[1].equals("R")){
                if(string[2].equals("R")){
                    System.out.println(3);
                }
            }
        }
        // RRS
        if(string[0].equals("R")){
            if(string[1].equals("R")){
                if(string[2].equals("S")){
                    System.out.println(2);
                }
            }
        }
        // RSS
        if(string[0].equals("R")){
            if(string[1].equals("S")){
                if(string[2].equals("S")){
                    System.out.println(1);
                }
            }
        }
        // RSR
        if(string[0].equals("R")){
            if(string[1].equals("S")){
                if(string[2].equals("R")){
                    System.out.println(1);
                }
            }
        }
        // SSS
        if(string[0].equals("S")){
            if(string[1].equals("S")){
                if(string[2].equals("S")){
                    System.out.println(0);
                }
            }
        }
        // SSR
        if(string[0].equals("S")){
            if(string[1].equals("S")){
                if(string[2].equals("R")){
                    System.out.println(1);
                }
            }
        }
        // SRR
        if(string[0].equals("S")){
            if(string[1].equals("R")){
                if(string[2].equals("R")){
                    System.out.println(2);
                }
            }
        }
        // SRS
        if(string[0].equals("S")){
            if(string[1].equals("R")){
                if(string[2].equals("S")){
                    System.out.println(1);
                }
            }
        }


    }
}