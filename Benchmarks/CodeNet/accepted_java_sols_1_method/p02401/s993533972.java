import java.io.*;

class Main
{
    public static void main (String[ ] args) throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        StringBuffer sb = new StringBuffer();
        
        while(true)
        {
            String[] strAry = (br.readLine()).split(" ");
            int a     = Integer.parseInt(strAry[0]);
            String op = strAry[1];
            int b     = Integer.parseInt(strAry[2]);
        
            if(true == op.equals("?"))
            {
                break;
            }

            switch(op.charAt(0))
            {
            case '*':
                sb.append(a * b).append("\n");
                break;
            case '/':
                sb.append(a / b).append("\n");
                break;
            case '+':
                sb.append(a + b).append("\n");
                break;
            case '-':
                sb.append(a - b).append("\n");
                break;
            }
        }
        System.out.print(sb);
    }
}