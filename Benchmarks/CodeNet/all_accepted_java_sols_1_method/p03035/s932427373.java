                                        import  java.util.Scanner;
                               
                                        class Main{
                                        	public static void main(String[] args){
                                              Scanner sc = new Scanner(System.in);
                                              String str = "";
                                              str = sc.nextLine();
                                             //System.out.println(str);
                                               String[] str2 = str.split(" ");
                                              //System.out.println(str);
                                              //String[] str2;
                                              //str2 = new String[2];
                                              //str2 = str.split(" ");
                                              int num1 = Integer.parseInt(str2[0]);
                                               int num2 = Integer.parseInt(str2[1]);
                                                
                                               if(num1 >= 13){
                                                 System.out.println(String.valueOf(num2));
                                               }else if(num1 >= 6){
                                                 System.out.println(String.valueOf(num2/2));
                                               }else {
                                                 System.out.println(String.valueOf(0));
                                               }
                                            }
                                        }