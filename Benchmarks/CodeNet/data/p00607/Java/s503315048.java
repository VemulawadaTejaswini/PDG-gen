import java.io.*;
import java.util.*;
import java.math.*;
public class Main{
        public static void main(String[] arg) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String is;
                String[] ia;

                while((is = in.readLine()) != null){
                        al = new ArrayList<StringBuffer>();
                        while(!is.equals("END_OF_TEXT")){
                                al.add(new StringBuffer(is));
                                is = in.readLine();
                        }
                        line = 0;
                        chat = 0;
                        buffer = null;
                        loc = false;
                        while((is = in.readLine()).charAt(0) != '-'){
                                switch(is.charAt(0)){
                                case 'a':
                                        chat = 0;
                                        break;
                                case 'e':
                                        chat = al.get(line).length();
                                        break;
                                case 'p':
                                        chat = 0;
                                        if(0 < line && line < al.size()){
                                                --line;
                                        }
                                        break;
                                case 'n':
                                        chat = 0;
                                        if(0 <= line && line < al.size()-1){
                                                ++line;
                                        }
                                        break;
                                case 'f':
                                        if(chat < al.get(line).length()){
                                                ++chat;
                                        } else if(0 <= line && line < al.size()-1){
                                                ++line;
                                                chat = 0;
                                        }
                                        break;
                                case 'b':
                                        if(0 < chat){
                                                --chat;
                                        } else if(0 < line && line < al.size()){
                                                --line;
                                                chat = al.get(line).length();
                                        }
                                        break;
                                case 'd':
                                        if(0 <= chat && chat < al.get(line).length()){
                                                al.get(line).deleteCharAt(chat);
                                        } else if(chat == al.get(line).length() &&
                                                  0 <= line && line < al.size()-1){
                                                al.get(line).append(al.get(line+1));
                                                al.remove(line+1);
                                        }
                                        break;
                                case 'k':
                                        if(0 <= chat && chat < al.get(line).length()){
                                                loc = false;
                                                buffer = new StringBuffer(al.get(line).substring(chat));
                                                al.get(line).delete(chat, al.get(line).length());
                                                chat = al.get(line).length();
                                        } else {
                                                if(chat == al.get(line).length() &&
                                                  0 <= line && line < al.size()-1){
                                                        loc = true;
                                                        al.get(line).append(al.get(line+1));
                                                        al.remove(line+1);
                                                        buffer = new StringBuffer();
                                                }
                                        }
                                        break;
                                case 'y':
                                        if(buffer == null){
                                        } else if(loc){
                                                al.add(line+1, new StringBuffer(al.get(line).substring(chat)));
                                                al.get(line).delete(chat, al.get(line).length());
                                                chat = 0;
                                                ++line;
                                        } else {
                                                al.set(line, new StringBuffer(al.get(line).substring(0,chat)).append(buffer).append(al.get(line).substring(chat)));
                                                chat+=buffer.length();
                                        }
                                        break;
                                }
                        }
                        for(int i = 0;i < al.size(); ++i){
                                System.out.println(al.get(i));
                        }
                }
        }
        static int line;
        static int chat;
        static StringBuffer buffer;
        static boolean loc;
        static ArrayList<StringBuffer> al;
}