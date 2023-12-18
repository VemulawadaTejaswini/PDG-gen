public class Q_0506 {
        public static void main(String[] args){
                if(args.length < 2){
                        System.err.println("too few argument");
                        return;
                }

                String numCode = args[1];
                for(int i=0; i<Integer.parseInt(args[0]); i++)
                        numCode = zip(numCode);
                System.out.println(numCode);
        }

        static String zip(String numCode){
                if(numCode.length() == 0)
                        return "";

                char top = numCode.charAt(0);
                String underCode = numCode.substring(1);

                int i;
                for(i=0; i<underCode.length(); i++){
                        if(top != underCode.charAt(i))
                                break;
                }

                return (i+1) + String.valueOf(top) +
                        zip(underCode.substring(i));
        }
}