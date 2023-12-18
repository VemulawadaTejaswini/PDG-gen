import javax.script.*;

public class EvalScript {
    public static void main(String[] args) throws Exception {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
       
        engine.eval("println('Hello JavaScript from Java.')");
       
        engine.eval("var str1 = 'JavaScript String'");
        engine.eval("println(str1);");
        engine.eval("var str2 = new java.lang.String('Java String');");
        engine.eval("println(str2);");
       
        engine.eval("var array = ['JavaScript', 'Array'];");
        engine.eval("println(array);");
        engine.eval("var list = new java.util.ArrayList();");
        engine.eval("list.add('Java');");
        engine.eval("list.add('ArrayList');");
        engine.eval("println(list);");
       
        engine.eval("var obj = {'JavaScript':'Object'};");
        engine.eval("println(obj);");
        engine.eval("var map = new java.util.HashMap();");
        engine.eval("map.put('Java', 'HashMap');");
        engine.eval("println(map);");
       
        Runtime r = Runtime.getRuntime();
        engine.put("r", r);
        engine.eval("print('Max:   ' + r.maxMemory() + ' Bytes\\n');");
        engine.eval("print('Total: ' + r.totalMemory() + ' Bytes\\n');");
        engine.eval("print('Free:  ' + r.freeMemory() + ' Bytes\\n');");
    }
}