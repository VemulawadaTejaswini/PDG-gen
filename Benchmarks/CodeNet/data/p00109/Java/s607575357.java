import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int line=Integer.parseInt(br.readLine());
		Main calc=new Main();
		for(int n=0;n<line;n++){
			String str=br.readLine();
			Integer num=calc.doCalc(str.substring(0,str.length()-1));
			if(num!=null){
				System.out.println(num);
			}
		}
	}

	Integer doCalc(String expr){
		return doCalc3(expr);
	}

	Integer doCalc3(String expr){
		ArrayList<String> num=new ArrayList<String>();
		int m=0;
		while(m<expr.length()){
			if(expr.indexOf("+",m)!=-1 && (expr.indexOf("-",m)==-1 || expr.indexOf("-",m)>expr.indexOf("+",m))){
				if(expr.substring(0,expr.indexOf("+",m)).indexOf("(")==-1){
					num.add(expr.substring(0, expr.indexOf("+")));
					num.add("+");
					expr=expr.substring(expr.indexOf("+",m)+1);
				}
				else if(expr.substring(0,expr.indexOf("+",m)).indexOf(")")==-1){
					m=expr.indexOf("+",m)+1;
				}
				else {
					num.add(expr.substring(0, expr.indexOf("+",m)));
					num.add("+");
					expr=expr.substring(expr.indexOf("+",m)+1);
				}
			}
			else if(expr.indexOf("-",m)!=-1 && (expr.indexOf("+",m)==-1 || expr.indexOf("+",m)>expr.indexOf("-",m))){
				if(expr.substring(0,expr.indexOf("-",m)).indexOf("(")==-1){
					num.add(expr.substring(0, expr.indexOf("-")));
					num.add("-");
					expr=expr.substring(expr.indexOf("-",m)+1);
				}
				else if(expr.substring(0,expr.indexOf("-",m)).indexOf(")")==-1){
					m=expr.indexOf("-",m)+1;
				}
				else {
					num.add(expr.substring(0, expr.indexOf("-",m)));
					num.add("-");
					expr=expr.substring(expr.indexOf("-",m)+1);
				}
			}
			else{
				break;
			}
		}
		num.add(expr);

		Integer n=doCalc2(num.get(0));
		m=1;
		while(m<num.size()){
			try {
				if(num.get(m)=="+"){
					n+=doCalc2(num.get(m+1));
				}
				else{
					n-=doCalc2(num.get(m+1));
				}
				m+=2;
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
				System.err.println(num.get(m)+"演算子の後には数字が来なくてはなりません。");
				return null;
			} catch (NullPointerException e){
				return null;
			}
		}
		return n;
	}

	Integer doCalc2(String expr){
		ArrayList<String> num=new ArrayList<String>();
		int m=0;
		while(m<expr.length()){
			if(expr.indexOf("*",m)!=-1 && (expr.indexOf("/",m)==-1 || expr.indexOf("/",m)>expr.indexOf("*",m))){
				if(expr.substring(0,expr.indexOf("*",m)).indexOf("(")==-1){
					num.add(expr.substring(0, expr.indexOf("*")));
					num.add("*");
					expr=expr.substring(expr.indexOf("*",m)+1);
				}
				else if(expr.substring(0,expr.indexOf("*",m)).indexOf(")")==-1){
					m=expr.indexOf("*",m)+1;
				}
				else {
					num.add(expr.substring(0, expr.indexOf("*",m)));
					num.add("*");
					expr=expr.substring(expr.indexOf("*",m)+1);
				}
			}
			else if(expr.indexOf("/",m)!=-1 && (expr.indexOf("*",m)==-1 || expr.indexOf("*",m)>expr.indexOf("/",m))){
				if(expr.substring(0,expr.indexOf("/",m)).indexOf("(")==-1){
					num.add(expr.substring(0, expr.indexOf("/")));
					num.add("/");
					expr=expr.substring(expr.indexOf("/",m)+1);
				}
				else if(expr.substring(0,expr.indexOf("/",m)).indexOf(")")==-1){
					m=expr.indexOf("/",m)+1;
				}
				else {
					num.add(expr.substring(0, expr.indexOf("/",m)));
					num.add("/");
					expr=expr.substring(expr.indexOf("/",m)+1);
				}
			}
			else{
				break;
			}
		}
		num.add(expr);

		Integer n=doCalc1(num.get(0));
		m=1;
		while(m<num.size()){
			try{
				if(num.get(m)=="*"){
					n*=doCalc1(num.get(m+1));
				}
				else{
					n/=doCalc1(num.get(m+1));
				}
				m+=2;
			} catch (IndexOutOfBoundsException e) {
				e.printStackTrace();
				System.err.println(num.get(m)+"演算子の後には数字が来なくてはなりません。");
				return null;
			} catch (NullPointerException e){
				return null;
			}
		}
		return n;
	}

	Integer doCalc1(String expr){
		if(expr.charAt(0)=='('){
			if(expr.indexOf(")")!=-1){
				return doCalc3(expr.substring(1,expr.indexOf(")")));
			}
			else{
				System.err.println(")が見つかりません。:"+expr);
				return null;
			}
		}
		else{
			if(expr.charAt(0)!=')'){
				try {
					return new Integer(expr);
				} catch (NumberFormatException e) {
					System.err.println("数字でないものが入力されています。:"+expr);
					return null;
				}
			}
			else{
				System.err.println("(がありません。:"+expr);
				return null;
			}
		}
	}
}