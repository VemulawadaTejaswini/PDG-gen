import java.util.*;
public class Main {
 
         
        public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
            char [][] map = new char [8][8];
            char [][] nmap = new char [8][8];
            for(int i=0;i<8;i++)
            	map[i] = scan.next().toCharArray();
            rotate(map,nmap);
            System.out.println("90");
            showmap(nmap);
            rotate(nmap,map);
            System.out.println("180");
            showmap(map);
            rotate(map,nmap);
            System.out.println("270");
            showmap(nmap);
        }
        public static void rotate (char[][] map ,char [][] nmap){
        	for(int i=0;i<8;i++)
        		for(int j=0;j<8;j++)
        			nmap[i][j] = map[7-j][i];
        }
        public static void showmap(char [][] map){
        	for(int i=0;i<8;i++)
        		System.out.println(map[i]);
        }
}