import java.io.*;

public class Main {

        public static void main(String[] args) throws IOException {
                BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

                String s;
                String t[];
                while((s = r.readLine()) != null){
                        t = s.split("[ ]");
                        if(t[0].equals("i")){
                                print_i(t[1],t[2]);
                        } else if(t[0].equals("u")){
                                print_u(t[1],t[2]);
                        }   
                }   
        }   
        static void print_i(String a, String b){ 
                int i = 0,j = 0;
                while(i < a.length() && j < b.length()){
                        if(a.charAt(i) == b.charAt(j)){
                                System.out.print(a.charAt(i));
                                i++;j++;
                        } else if(a.charAt(i) == '('){
                                while(a.charAt(i++) != ')'){
                                }   
                        } else if(b.charAt(j) == '('){
                                while(b.charAt(j++) != ')'){
                                }   
                        }   
                }   
                System.out.println("");
        }   

        static void print_u(String a, String b){ 
                int i = 0,j = 0;
                while(i < a.length() && j < b.length()){
                        if(a.charAt(i) == b.charAt(j)){
                                System.out.print(a.charAt(i));
                                ++i;++j;
                        } else if(a.charAt(i) == '('){
                                while(a.charAt(i) != ')'){
                                        System.out.print(a.charAt(i));
                                        ++i;
                                }
                                System.out.print(a.charAt(i));
                                ++i;
                        } else if(b.charAt(j) == '('){
                                while(b.charAt(j) != ')'){
                                        System.out.print(b.charAt(j));
                                        ++j;
                                }
                                System.out.print(b.charAt(j));
                                ++j;
                        }
                }
                System.out.println("");
        }
}