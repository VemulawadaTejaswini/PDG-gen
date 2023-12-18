import java.util.*;
class Main{
    public static void main(String[] a){
        StringBuilder buf = new StringBuilder();
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                buf.append(i).append("x").append(j).append("=").append(i*j).append("\n");
            }
        }
        System.out.printf(buf.toString());
    }
}