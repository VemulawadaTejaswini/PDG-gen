import java.awt.*;
import java.io.*;
import java.net.StandardSocketOptions;
import java.util.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        new Main();
    }
    public Main(){
        new TestA().doIt();
    }
    class TestA{
        void doIt() {
            String str = sc.next();
            String zero[] = {"SSS"};
            String one[] = {"RSS","SRS","SSR","RSR"};
            String two[] = {"RRS","SRR"};
            String three[] = {"RRR"};
            for(int i = 0;i < zero.length;i++){
                if(str.equals(zero[i]))System.out.println(0);
            }
            for(int i = 0;i < one.length;i++) {
                if (str.equals(one[i])) System.out.println(1);
            }
            for(int i = 0;i < two.length;i++){
                if(str.equals(two[i]))System.out.println(2);
            }
            for(int i = 0;i < three.length;i++){
                if(str.equals(three[i]))System.out.println(3);
            }
        }
    }
}